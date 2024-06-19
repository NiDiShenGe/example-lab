package cn.edu.zust.se.InterpreterPattern;

/**
 * @Author: ShenYi
 * @Date: 2024-06-19-3:40
 * @Description:
 */
public class OrExpression implements Expression{
    private Expression expr1 = null;
    private Expression expr2 = null;

    public OrExpression(Expression expr1, Expression expr2){
        this.expr1 = expr1;
        this.expr2 = expr2;
    }
    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) || expr2.interpret(context);
    }
}
