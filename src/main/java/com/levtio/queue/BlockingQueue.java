package com.levtio.queue;

/**
 * @ Author：levtio
 * @ Date：2024-07-09-下午2:57
 * @ Description：阻塞队列接口
 */
public interface BlockingQueue<E> extends Queue<E> {

    boolean add(E e);

    boolean offer(E e);

}
