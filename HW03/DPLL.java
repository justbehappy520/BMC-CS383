import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Arrays;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class DPLL {

    public static boolean dpll(List<List<String>> clauses, Map<String, Boolean> assignment) {
        // TODO: Implement the DPLL algorithm here
        // doesn't seem to change anything
        if (isFormulaSatisfied(clauses, assignment)) {
            return true; // satisfied
        }    
        clauses = unitPropogation(clauses, assignment);
        // base case
        if (clauses == null) {
            return false; // unsatisfied
        }
        // if clause is empty, unsatisfied
        for (List<String> clause : clauses) {
            if (clause.isEmpty()) {
                return false; // unsatisfiable
            }
        }
        // if no clauses left, satisfied
        if (clauses.isEmpty()) {
            return true; // satisfied
        }
        // if unit clauses, propagate and continue
        clauses = unitPropogation(clauses, assignment);
        //System.out.println("Current formula: " + clauses);
        //System.out.println("Current assignment: " + assignment);
        // if no unit clauses, recurse
        for (List<String> clause : clauses) {
            for (String literal : clause) {
                String var = literal.replace("~", "");
                // if not yet assigned
                if (!assignment.containsKey(var)) {
                    // true and recurse
                    Map<String, Boolean> newAssignmentTrue = new HashMap<>(assignment);
                    newAssignmentTrue.put(var, true);
                    List<List<String>> newClauses = update(clauses, var, true);
                    if (dpll(newClauses, newAssignmentTrue)) {
                        // assignment.clear();
                        assignment.putAll(newAssignmentTrue);
                        return true; // satisfied
                    }
                    // backtrack, false, and recurse
                    Map<String, Boolean> newAssignmentFalse = new HashMap<>(assignment);
                    newAssignmentFalse.put(var, false);
                    List<List<String>> newClaws = update(clauses, var, false);
                    if (dpll(newClaws, newAssignmentFalse)) {
                        // assignment.clear();
                        assignment.putAll(newAssignmentFalse);
                        return true; // satisfied
                    }
                    // remove if neither works
                    // assignment.remove(var);
                    return false; // unsatisfied
                }
            }
        }
        return false;  // unsatisfied
    }

    private static List<List<String>> update(List<List<String>> clauses, String str, boolean value) {
        List<List<String>> newClauses = new ArrayList<>();
        // iterate through clauses
        for (List<String> clause : clauses) {
            List<String> newClause = new ArrayList<>();
            boolean clauseUpdated = false;
            for (String literal : clause) {
                // check if literal matches assignment
                if (literal.equals(str) && value) {
                    // if true, satisfied and skip
                    clauseUpdated = true;
                    break;
                }
                // check if negation is there
                if (literal.equals("~" + str) && !value) {
                    // if neg is false, satisfied and skip
                    clauseUpdated = true;
                    break;
                }
                // if false, add to newClause
                if (!literal.equals(str) && !literal.equals("~" + str)) {
                    newClause.add(literal);
                }
            }
            // if unsatisfied, add to newClauses
            if (!clauseUpdated) {
                newClauses.add(newClause);
            }
        }
        return newClauses;
    }

    public static List<List<String>> unitPropogation(List<List<String>> clauses, Map<String, Boolean> assignment) {
        // TODO
        //List<List<String>> newClauses = new ArrayList<>();
        boolean changed = true; // track literals that have been propogated
        while (changed) {
            changed = false;
            for (List<String> clause : clauses) {
                // check if unit clause (only one unassigned literal)
                long unassignedCount = 0;
                String unassignedLiteral = null;
                for (String literal : clause) {
                    String var = literal.replace("~", "");
                    if (!assignment.containsKey(var)) {
                        unassignedCount++;
                        unassignedLiteral = literal;
                    }
                }
                if (unassignedCount == 1) {
                    // assign value to variable in unit clause
                    boolean value = unassignedLiteral.startsWith("~") ? false : true;
                    String var = unassignedLiteral.replace("~", "");
                    assignment.put(var, value);
                    // simplify
                    clauses = update(clauses, var, value);
                    changed = true;
                    break; // restart
                }
                // if not unit clause, keep
                //newClauses.add(clause);
            }
        }
        return clauses;    
    }

    public static boolean isClauseSatisfied(List<String> clause, Map<String, Boolean> assignment) {
        // TODO
        for (String literal : clause) {
            boolean negated = literal.startsWith("~"); // check if is negated
            String var = negated ? literal.substring(1) : literal;
        
            // check if literal has value
            if (assignment.containsKey(var)) {
                boolean value = assignment.get(var);
                if (negated && !value || !negated && value) {
                    return true;  // clause is satisfied
                }
            }
        }
        return false; // clause is unsatisfied
    }

    public static boolean isFormulaSatisfied(List<List<String>> clauses, Map<String, Boolean> assignment) {
        Iterator<List<String>> itr = clauses.iterator();
        while (itr.hasNext()) {
            List<String> clause = itr.next();
            if (isClauseSatisfied(clause, assignment)) {
                // clause satisfied, remove!!
                itr.remove();
            } else if (clause.isEmpty()) {
                // empty clause == UNSAT
                return false;
            }
        }
        return clauses.isEmpty();  // formula is satisfied if no clauses remain
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java DPLL <input-file>");
            return;
        }

        String filename = args[0];
        List<List<String>> clauses = new ArrayList<>();
        Set<String> variables = new HashSet<>();

        // Read the CNF file in the new format
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) {
                    continue;
                }
                String[] rawClauses = line.split("\\) \\(");
                for (String rawClause : rawClauses) {
                    rawClause = rawClause.replace("(", "").replace(")", "").trim();
                    List<String> clause = Arrays.asList(rawClause.split("\\s+"));
                    clauses.add(clause);
                    for (String literal : clause) {
                        variables.add(literal.replace("~", ""));
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // measure runtime for DPLL
        long startTime = System.currentTimeMillis();
        Map<String, Boolean> assignment = new HashMap<>();
        boolean satisfiable = dpll(clauses, assignment);
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime; // time in nanosecondsja

        if (satisfiable) {
            System.out.println("SATISFIABLE");
            System.out.println("Assignment: " + assignment);
        } else {
            System.out.println("UNSATISFIABLE");
        }

        System.out.println("Time taken: " + duration + " milliseconds");
    }
}