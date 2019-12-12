package com.barry.mockito.utis;

import org.junit.Test;
import java.util.List;
import static org.mockito.Mockito.*;

public class BehaviourVerifyTest {

    @Test
    public void verify_behaviour(){
        //模拟创建一个Listdui
        List mock = mock(List.class);
        //使用mock的对象
        mock.add(1);
        mock.clear();
        //验证add(1)和clear()的行为是否发生
        verify(mock).add(1);
        verify(mock).clear();
    }


}
