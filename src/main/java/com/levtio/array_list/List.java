package com.levtio.array_list;

/**
 * @ Author：levtio
 * @ Date：2024-04-11-15:28
 * @ Description：List 接口
 */
public interface List<E> {

    boolean add(E e);

    E remove(int index);

    E get(int index);

}
