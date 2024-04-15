package com.levtio.array_list;

import java.util.Arrays;

/**
 * @ Author：levtio
 * @ Date：2024-04-11-15:28
 * @ Description：数组简易实现
 */
public class ArrayList<E> implements List<E> {

    /**
     * 默认初始化空间
     */
    private static final int DEFAULT_CAPACITY = 10;

    /**
     * 空元素
     */
    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};

    /**
     * ArrayList 元素数组缓存区
     */
    transient Object[] elementData;

    /**
     * List 集合元素数量
     */
    private int size;

    public ArrayList() {
        // 默认给个空的元素，当开始添加元素的时候在初始化长度
        this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
    }

    @Override
    public boolean add(E e) {
        // 确保内部容量
        int minCapacity = size + 1;
        if(elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
            minCapacity = Math.max(DEFAULT_CAPACITY, minCapacity);
        }
        // 判断扩容操作
        if (minCapacity - elementData.length > 0){
            int oldCapacity = elementData.length;
            int newCapacity = oldCapacity + (oldCapacity >> 1);
            if(newCapacity - minCapacity < 0){
                newCapacity = minCapacity;
            }
            elementData = Arrays.copyOf(elementData, newCapacity);
        }
        // 添加元素
        elementData[size++] = e;
        return true;
    }

    @Override
    public E remove(int index) {
        E oldValue = (E) elementData[index];
        int numMoved = size - index - 1;
        if(numMoved > 0){
            System.arraycopy(elementData, index + 1, elementData, index, numMoved);
        }
        elementData[--size] = null;
        return oldValue;
    }

    @Override
    public E get(int index) {
        return (E) elementData[index];
    }

    @Override
    public String toString() {
        return "ArrayList{" +
                "elementData=" + Arrays.toString(elementData) +
                ", size=" + size +
                '}';
    }

}
