package com.levtio.queue;

/**
 * @ Author：levtio
 * @ Date：2024-07-09-下午2:51
 * @ Description：单端队列
 */
public interface Queue<E> {

    boolean add(E e);

    boolean offer(E e);

    E poll();

    E peek();
}
