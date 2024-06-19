package cn.edu.zust.se;

import cn.edu.zust.se.InterpreterPattern.AndExpression;
import cn.edu.zust.se.InterpreterPattern.Expression;
import cn.edu.zust.se.InterpreterPattern.OrExpression;
import cn.edu.zust.se.InterpreterPattern.TerminalExpression;
import org.junit.Test;

/**
 * @Author: ShenYi
 * @Date: 2024-06-19-3:43
 * @Description:
 */
public class InterpreterPatternDemo {
    //规则：Robert 和 John 是男性
    public static Expression getMaleExpression(){
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    //规则：Julie 是一个已婚的女性
    public static Expression getMarriedWomanExpression(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }
    @Test
    public void test() {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is a married women? "
                + isMarriedWoman.interpret("Married Julie"));
    }
}
