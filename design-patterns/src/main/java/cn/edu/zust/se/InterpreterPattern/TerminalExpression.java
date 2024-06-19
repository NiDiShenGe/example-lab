package cn.edu.zust.se.InterpreterPattern;

/**
 * @Author: ShenYi
 * @Date: 2024-06-19-2:37
 * @Description:
 */
public class TerminalExpression implements Expression{
    private String data;
    public TerminalExpression(String data){
        this.data = data;
    }
    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
