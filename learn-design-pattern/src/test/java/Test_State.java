import com.daihui.state.code.service.impl.StartState;
import com.daihui.state.code.service.impl.StopState;
import com.daihui.state.code.context.Context;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 状态模式
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2016-09-06 11:20
 */
public class Test_State {


    @Test
    public void Test(){

        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
