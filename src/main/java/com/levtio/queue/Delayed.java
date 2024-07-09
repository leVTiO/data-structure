package com.levtio.queue;

import java.util.concurrent.TimeUnit;

/**
 * @ Author：levtio
 * @ Date：2024-07-09-下午2:55
 * @ Description：延迟队列接口
 */
public interface Delayed extends Comparable<Delayed>{

    long getDelay(TimeUnit timeUnit);

}
