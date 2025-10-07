import com.microsoft.z3.*;

public class HW3Part1 {

    public static void f1() {
        //Boolean Proposition 1:  ~~A

        //setup solver
        Context ctx = new Context(); 
        Solver solver = ctx.mkSolver();

        //declare boolean variables 
        BoolExpr a = ctx.mkBoolConst("A");

        //(~A)
        BoolExpr clause1 = ctx.mkNot(a);

        //(~(~A))
        solver.add(ctx.mkNot(clause1));

        //query the solver
        System.out.println(solver.check());
        //get the last model - throws NPE if it is UNSAT
        System.out.println(solver.getModel());
    }

    public static void f2() {
        //Boolean Proposition 2:  A ^ ~A

        //setup solver
        Context ctx = new Context(); 
        Solver solver = ctx.mkSolver();

        //declare boolean variables 
        BoolExpr a = ctx.mkBoolConst("A");

        // (~A)
        BoolExpr clause1 = ctx.mkNot(a);

        // A ^ ~A
        solver.add(ctx.mkAnd(a, clause1));

        //query the solver
        System.out.println(solver.check());
        //get the last model - throws NPE if it is UNSAT
        // System.out.println(solver.getModel());
    }


    public static void f3() {
        //Boolean Proposition 3:  (A v B) ^ (~A v C) ^ (~B v ~C)

        //setup solver
        Context ctx = new Context(); 
        Solver solver = ctx.mkSolver();

        //declare boolean variables 
        BoolExpr a = ctx.mkBoolConst("A");
        BoolExpr b = ctx.mkBoolConst("B");
        BoolExpr c = ctx.mkBoolConst("C");

        // (A v B)
        BoolExpr clause1 = ctx.mkOr(a, b);
        // (~A v C)
        BoolExpr clause2 = ctx.mkOr(ctx.mkNot(a), c);
        // (~B v ~C)
        BoolExpr clause3 = ctx.mkOr(ctx.mkNot(b), ctx.mkNot(c));

        // (A v B) ^ (~A v C) ^ (~B v ~C)
        solver.add(ctx.mkAnd(clause1, clause2, clause3));

        //query the solver
        System.out.println(solver.check());
        //get the last model - throws NPE if it is UNSAT
        System.out.println(solver.getModel());        
    }


    public static void f4() {
        //Boolean Proposition 4: (A∨B∨C)∧(¬A∨D)∧(¬B∨¬D)∧(C∨¬D)∧(A∨¬C) 

        //setup solver
        Context ctx = new Context(); 
        Solver solver = ctx.mkSolver();

        //declare boolean variables 
        BoolExpr a = ctx.mkBoolConst("A");
        BoolExpr b = ctx.mkBoolConst("B");
        BoolExpr c = ctx.mkBoolConst("C");
        BoolExpr d = ctx.mkBoolConst("D");

        // (A v B v C)
        BoolExpr clause1 = ctx.mkOr(a, b, c);
        // (~A v D)
        BoolExpr clause2 = ctx.mkOr(ctx.mkNot(a), d);
        // (~B v ~D)
        BoolExpr clause3 = ctx.mkOr(ctx.mkNot(b), ctx.mkNot(d));
        // (C v ~D)
        BoolExpr clause4 = ctx.mkOr(c, ctx.mkNot(d));
        // (A v ~C)
        BoolExpr clause5 = ctx.mkOr(a, ctx.mkNot(c));

        // (A v B v C) ^ (~A v D) ^ (~B v ~D) ^ (C v ~D) ^ (A v ~C)
        solver.add(ctx.mkAnd(clause1, clause2, clause3, clause4, clause5));

        //query the solver
        System.out.println(solver.check());
        //get the last model - throws NPE if it is UNSAT
        System.out.println(solver.getModel());
    }

    public static void f5() {
        //Boolean Proposition 5: (A∨B∨C)∧(¬A∨D)∧(¬B∨D)∧(¬C∨D)∧(¬D∨E)∧(A∨¬E)∧(B∨¬E)∧(C∨¬E)∧(¬A∨¬B)∧(¬B∨¬C)∧(¬A∨¬C)

        //setup solver
        Context ctx = new Context(); 
        Solver solver = ctx.mkSolver();

        //declare boolean variables 
        BoolExpr a = ctx.mkBoolConst("A");
        BoolExpr b = ctx.mkBoolConst("B");
        BoolExpr c = ctx.mkBoolConst("C");
        BoolExpr d = ctx.mkBoolConst("D");
        BoolExpr e = ctx.mkBoolConst("E");

        // (A v B v C)
        BoolExpr clause1 = ctx.mkOr(a, b, c);
        // (~A v D)
        BoolExpr clause2 = ctx.mkOr(ctx.mkNot(a), d);
        // (~B v D)
        BoolExpr clause3 = ctx.mkOr(ctx.mkNot(b), d);
        // (~C v D)
        BoolExpr clause4 = ctx.mkOr(ctx.mkNot(c), d);
        // (~D ∨ E)
        BoolExpr clause5 = ctx.mkOr(ctx.mkNot(d), e);
        // (A ∨ ~E)
        BoolExpr clause6 = ctx.mkOr(a, ctx.mkNot(e));
        // (B ∨ ~E)
        BoolExpr clause7 = ctx.mkOr(b, ctx.mkNot(e));
        // (C ∨ ~E)
        BoolExpr clause8 = ctx.mkOr(c, ctx.mkNot(e));
        // (~A ∨ ~B)
        BoolExpr clause9 = ctx.mkOr(ctx.mkNot(a), ctx.mkNot(b));
        // (~B ∨ ~C)
        BoolExpr clause10 = ctx.mkOr(ctx.mkNot(b), ctx.mkNot(c));
        // (~A ∨ ~C)
        BoolExpr clause11 = ctx.mkOr(ctx.mkNot(a), ctx.mkNot(c));

        // (A∨B∨C)∧(¬A∨D)∧(¬B∨D)∧(¬C∨D)∧(¬D∨E)∧(A∨¬E)∧(B∨¬E)∧(C∨¬E)∧(¬A∨¬B)∧(¬B∨¬C)∧(¬A∨¬C)
        solver.add(ctx.mkAnd(clause1, clause2, clause3, clause4, clause5, clause6,
            clause7, clause8, clause9, clause10, clause11));

        //query the solver
        System.out.println(solver.check());
        //get the last model - throws NPE if it is UNSAT
        //System.out.println(solver.getModel());
    }

    public static void prog1() {
        //setup solver
        Context ctx = new Context(); 
        Solver solver = ctx.mkSolver();

        //declare integer variables 
        ArithExpr x = (ArithExpr) ctx.mkIntConst("X");
        ArithExpr y = (ArithExpr) ctx.mkIntConst("Y");

        // (x > y)
        BoolExpr statement1 = ctx.mkGt(x, y);
        // (y == 0)
        BoolExpr statement2 = ctx.mkEq(y, ctx.mkInt(0));

        // triggering condition
        solver.add(ctx.mkAnd(statement1, statement2));

        // query the solver
        System.out.println(solver.check());
        //get the last model - throws NPE if it is UNSAT
        System.out.println(solver.getModel());
    }

    public static void prog2() {
        //setup solver
        Context ctx = new Context(); 
        Solver solver = ctx.mkSolver();

        //declare integer variables 
        ArithExpr x = (ArithExpr) ctx.mkIntConst("X");
        ArithExpr y = (ArithExpr) ctx.mkIntConst("Y");
        ArithExpr z = (ArithExpr) ctx.mkIntConst("Z");

        // (z == x)
        BoolExpr statement1 = ctx.mkGe(x, z);
        // (z > x)
        BoolExpr statement2 = ctx.mkGt(z, x);
        // (z >= x)
        BoolExpr statement3 = ctx.mkOr(statement1, statement2);
        // (z % 2)
        ArithExpr statement4 = ctx.mkMod(z, ctx.mkInt(2));
        // (x + y)
        ArithExpr statement5 = ctx.mkAdd(x, y);
        // (x + y - z % 2)
        ArithExpr statement6 = ctx.mkSub(statement5, statement4);
        // (x + y - z % 2 == 0)
        BoolExpr statement7 = ctx.mkEq(statement6, ctx.mkInt(0));
        // (3 * x)
        ArithExpr statement8 = ctx.mkMul(x, ctx.mkInt(3));
        // (3 * x + 7)
        ArithExpr statement9 = ctx.mkAdd(statement8, ctx.mkInt(7));
        // (y > 3 * x + 7)
        BoolExpr statement10 = ctx.mkGt(y, statement9);
        // (z - x)
        ArithExpr statement11 = ctx.mkSub(z, x);
        // (z - x == 0)
        BoolExpr statement12 = ctx.mkEq(statement11, ctx.mkInt(0));

        // triggering condition
        solver.add(ctx.mkAnd(statement12, statement10, statement7, statement3));

        // query the solver
        System.out.println(solver.check());
        //get the last model - throws NPE if it is UNSAT
        System.out.println(solver.getModel());
    }

    public static void example() {
        //setup solver
        Context ctx = new Context(); 
        Solver solver = ctx.mkSolver();

        //declare boolean variables p, q, and r
        BoolExpr p = ctx.mkBoolConst("p");
        BoolExpr q = ctx.mkBoolConst("q");
        BoolExpr r = ctx.mkBoolConst("r");

        //(p V q)
        BoolExpr clause1 = ctx.mkOr(p,q);
        //(p V ~r)
        BoolExpr clause2 = ctx.mkOr(p,ctx.mkNot(r));

        //(p V q) ^ (p V ~r) 
        solver.add(ctx.mkAnd(clause1, clause2));

        //query the solver
        System.out.println(solver.check());
        //get the last model - throws NPE if it is UNSAT
        System.out.println(solver.getModel());
    }

    public static void main(String[] args) {
        
        System.out.println();
        System.out.println("================ EXAMPLE ================");
        example();

        System.out.println();
        System.out.println("================ PROPOSITION 1 ================");
        f1();

        System.out.println();
        System.out.println("================ PROPOSITION 2 ================");
        f2();

        System.out.println();
        System.out.println("================ PROPOSITION 3 ================");
        f3();

        System.out.println();
        System.out.println("================ PROPOSITION 4 ================");
        f4();

        System.out.println();
        System.out.println("================ PROPOSITION 5 ================");
        f5();

        System.out.println();
        System.out.println("================ PROGRAM 1 ================");
        prog1();

        System.out.println();
        System.out.println("================ PROGRAM 2 ================");
        prog2();

    }
}
