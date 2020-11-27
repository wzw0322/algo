package com.wzw.algo.array;

/**
 * @Description 动态数组
 * @Author: wzw03
 * @Date: 2020/6/15 22:13
 */
public class ArrayList<E> {

    /**元素个数**/
    private int size;
    /**存放元素的数组**/
    private Object[] elements;
    /**默认容量**/
    private static final int DEFAULT_CAPACITY = 10;

    private static final int ELEMENT_NO_FIND = -1;

    public ArrayList() {
        this(DEFAULT_CAPACITY);
    }

    public ArrayList(int size) {
        if(size < 0 || size > Integer.MAX_VALUE){
           size = DEFAULT_CAPACITY;
        }
        this.elements = new Object[size];
    }

    /**
     * 元素容量
     * @Author wzw03
     **/
    public int size(){
        return size;
    }

    /**
     * 是否为空
     * @Author wzw03
     * @Date 2020/6/15 22:18
     **/
    public boolean isEmpty(){
        return size == 0;
    }

    /**
     * 是否包含element的元素
     * @Author wzw03
     * @Date 2020/6/15 22:19
     **/
    public boolean contains(E element){
        /*for(int i = 0; i< size; i++){
            if(elements[i].equals(element)){
                return true;
            }
        }*/
        return indexOf(element) != ELEMENT_NO_FIND;
    }

    /**
     * 添加到元素后面
     * @Author wzw03
     * @Date 2020/6/15 22:20
     **/
    public void add(E element){
        add(size, element);
    }

    /**
     * 添加element到index位置
     * @Author wzw03
     * @Date 2020/6/15 22:22
     **/
    public void add(int index, E element){
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("index="+index+",size="+size);
        }
        if(size+1 > elements.length){
            addCapacity();
        }
        for(int i=size-1; i>=index;i--){
            elements[i+1] = elements[i];
        }
        elements[index] = element;
        size++;
    }

    /**
     * 将index位置的元素设置为element
     * @Author wzw03
     * @Date 2020/6/15 22:23
     **/
    public void set(int index, E element){

    }

    /**
     * 移除element元素
     * @Author wzw03
     * @Date 2020/6/15 22:25
     **/
    public void remove(E element){


    }

    /**
     * 返回index位置的元素
     * @Author wzw03
     * @Date 2020/6/15 22:24
     **/
    public E get(int index){

        return null;
    }

    /**
     * 返回元素索引
     * @Author wzw03
     * @Date 2020/6/15 22:28
     * @param element :
     * @return int
     **/
    public int indexOf(E element){
        if(element == null){
            for(int i=0; i<size; i++){
                if(elements[i] == null){
                    return i;
                }
            }
        }else{
            for(int i=0; i<size; i++){
                //不能使用 elements[i].equals(element)这种方式，因为elements[i]可能为null
                if(element.equals(elements[i])){
                    return i;
                }
            }
        }

        return ELEMENT_NO_FIND;
    }

    /**
     * 清空元素
     * @Author wzw03
     * @Date 2020/6/15 22:28
     * @return void
     **/
    public void clear(){
        for (int i=0; i<size; i++){
            elements[i] = null;
        }
        size = 0;
    }

    private void addCapacity(){
        int elementLength = elements.length;
        int newCapacity = elementLength;
        Object[] newElements = new Object[newCapacity];
        for(int i=0; i<size; i++){
            newElements[i] = elements[i];
        }
        elements = newElements;
    }



}
