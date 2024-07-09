package com.levtio.queue;

/**
 * @ Author：levtio
 * @ Date：2024-07-09-下午2:54
 * @ Description：双端队列接口
 */
public interface Deque<E> extends Queue<E> {

    void addFirst(E e);

    void addLast(E e);

}
