package com.nepxion.thunder.testcase.eventbus;

/**
 * <p>Title: Nepxion Thunder</p>
 * <p>Description: Nepxion Thunder For Distribution</p>
 * <p>Copyright: Copyright (c) 2017-2020</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @email 1394997@qq.com
 * @version 1.0
 */

import com.nepxion.thunder.event.eventbus.Event;

public class MyEvent extends Event {
    private static final long serialVersionUID = -2555621013042771921L;

    public MyEvent(Object source) {
        super(source);
    }
}