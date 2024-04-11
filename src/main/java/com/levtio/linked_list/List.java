package com.levtio.linked_list;

/**
 * @ Author：levtio
 * @ Date：2024-04-11-10:29
 * @ Description：List 接口
 */
public interface List<E> {

    boolean add(E e);

    boolean addFirst(E e);

    boolean addLast(E e);

    boolean remove(Object o);

    E get(int index);

    void printLinkList();

}
