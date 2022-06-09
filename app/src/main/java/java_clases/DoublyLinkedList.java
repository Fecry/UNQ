package java_clases;


public class DoublyLinkedList<E> {
    private Node<E> header;
    private Node<E> trailer;
    private int size;
    
    public DoublyLinkedList(){
        header = new Node<>(null, null, null);
        trailer = new Node<>(null, header, null);
        header.setNext(trailer);
        size = 0;
    }
    
    private static class Node<E>{
        
        private Node<E> prev;
        private Node<E> next;
        private E element;
        
        public Node(E element, Node<E> prev, Node<E> next){
            this.prev = prev;
            this.next = next;
            this.element = element;
        }
        
        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public E getElement() {
            return element;
        }
        
        @Override
        public String toString(){
            return element.toString();
        }
    }
    
    public int size(){
        return size;
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
    
    public E first(){
        if (isEmpty()) return null;
        return header.getNext().getElement();
    }
    
    public E last(){
        if (isEmpty()) return null;
        return trailer.getPrev().getElement();
    }
    
    
    public void addLast(E element){
        addBetween(element, trailer.getPrev(), trailer);
    }
    
    public void addFirst(E element){
        addBetween(element, header, header.getNext());
    }
    
    public void add(int index, E element){
        Node<E> aux = header.getNext();
        
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Indice invalido: " + index);
        }
        
        if (index == 0){
            addFirst(element);
        }
        
        if (index == size - 1){
            addLast(element);
        }
        
        for (int i = 0; i < index; i ++){
            if (aux.getNext() == trailer){
                break;
            }
            aux = aux.getNext();
        }
        
        addBetween(element, aux.getPrev(), aux.getNext());
    }
    
    private void addBetween(E element, Node<E> anterior, Node<E> siguiente){
        Node<E> newNode = new Node<>(element, anterior, siguiente);
        anterior.setNext(newNode);
        siguiente.setPrev(newNode);
        size++;
    }
    
    public E removeFirst(){
        if (isEmpty()) return null;
        return remove(header.getNext());
    }
    
    public E removeLast(){
        if (isEmpty()) return null;
        return remove(trailer.getPrev());
    }
    
    public E remove(int index){
        Node<E> aux = header.getNext();
        
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Indice invalido: " + index);
        }
        
        if (index == 0){
            return removeFirst();
        }
        
        if (index == size - 1){
            return removeLast();
        }
        
        for (int i = 0; i < index; i++){
            if (aux.getNext() == trailer){
                break;
            }
            aux = aux.getNext();
        }
        
        return remove(aux);
        
    }
    
    private E remove(Node<E> node){
        Node<E> anterior = node.getPrev();
        Node<E> siguiente = node.getNext();
        anterior.setNext(siguiente);
        siguiente.setPrev(anterior);
        size--;
        return node.getElement();
    }
    
    @Override
    public String toString(){
        Node<E> aux = header.getNext();
        StringBuilder strbldr = new StringBuilder();
        String lista;
        strbldr.append("[");
        
        while (aux != null){
            if (aux.getNext() == trailer){
                strbldr.append(aux.getElement());
                break;
            }
            strbldr.append(aux.getElement());
            strbldr.append(", ");
            aux = aux.getNext();
        }
        strbldr.append("]");
        lista = strbldr.toString();
        return lista;
    }
}
