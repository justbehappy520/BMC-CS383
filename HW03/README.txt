Partners: Rebecca Lassman, Megan Louie :3
Part 1:
    Proposition 1: SAT | A = true
    Proposition 2: UNSAT
    Proposition 3: SAT | A = false | B = true | C = false
    Proposition 4: SAT | A = false | B = true | C = false | D = false
    Proposition 5: UNSAT
    Program 1: SAT | X = 1 | Y = 0
        // (x > y)
        BoolExpr statement1 = ctx.mkGt(x, y);
        // (y == 0)
        BoolExpr statement2 = ctx.mkEq(y, ctx.mkInt(0));
        // triggering condition
        solver.add(ctx.mkAnd(statement1, statement2));
    Program 2: SAT | X = -2 | Y = 2 | Z = -2
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
Part 2:
    Our data shows that the number of different literals and the number of clauses both have an affect on the runtime of the program. Increasing the number of clauses increases the runtime, as does increasing the number of literals. Our data shows that the ratio of 1 variable to about 4 or 5 clauses produces the highest runtime for that number of clauses. We also discovered that the runtime for a certain number of literals and clauses can vary drastically.
    Our graph shows the relationship between the number of literals and the runtime in milliseconds. We chose this graph because it depicts the relationship between the increasing input and the resulting runtime more clearly than the graph between the number of clauses and the runtime. This is because of the ratio between the number of literals and clauses affects the runtime of the program. Once the number of literals increases pass about 100, with a ratio of around 1:4 or 1:5, the runtime increases significantly.