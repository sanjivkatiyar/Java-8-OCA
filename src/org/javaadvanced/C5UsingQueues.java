package org.javaadvanced;

import java.util.*;

public class C5UsingQueues {
    public static void main(String[] args) {
        linkedListQueue();
        arrayDeque();
        priorityQueueNaturalOrdering();
        priorityQueueCustomOrdering();
    }

    public static void linkedListQueue(){
        // A FIFO queue (First in First out)
        Queue<Integer> queue = new LinkedList<>();
        // add() inserts into queue (throws exception if no space exists - if capacity restricted)
        // offer() inserts into queue (returns false if no space exists - capacity restricted)
        queue.add(1);
        System.out.println(queue);
        queue.offer(2);
        System.out.println(queue);
        queue.add(3);
        System.out.println(queue);
        queue.offer(4);
        System.out.println(queue);

        // element() retrieves but does not remove the head of the queue (throws exception if queue empty)
        // peek() retrieves but does not remove the head of the queue (returns null if queue is empty)
        System.out.println(queue.element());
        System.out.println(queue.peek());

        // remove() - Retrieves and removes the head of the queue (throws exception if queue is empty)
        // poll() - Retrieves and reoves the head of the queue (returns null if queue is empty)

        System.out.println(queue.remove());
        System.out.println(queue.poll());
        System.out.println(queue);

        // offfer(), poll() and peek() are preffered methods as they do not throw exceptions. (P.O.P.)
    }

    public static void arrayDeque(){
        // Deque = "doubly ended queue". Supports element insertion/removal at both ends.
        // ArrayDeque - resizeable-array implementation of the Deque interface (no capacity restrictions)

        Deque<Integer> numbers = new ArrayDeque<>();
        // a.r.g - Deque methods that begins with a, r or g  e.g. addFirst(), addLast(),
        // removeFirst(), removeLast(), getFirst() and getLast() all throw exception if the deque is
        // both capacity constrained and full.
        // the other methods (P.O.P.) i.e. peekFirst(), peekLast(), offerFirst(), offerLast(), pollFirst()
        // pollLast() returns null/false rather than throwing exception.

        // add a front (the head)
        numbers.add(1);
        System.out.println(numbers);
        numbers.addFirst(2);
        System.out.println(numbers);
        numbers.offerFirst(3);
        System.out.println(numbers);
        System.out.println(numbers.getFirst());
        System.out.println(numbers.peekFirst());
        System.out.println(numbers.peek());

        // add at the end (the tail)
        numbers.addLast(4);
        System.out.println(numbers);
        numbers.offerLast(5);
        System.out.println(numbers);

        // remove elements from both ends
        numbers.removeFirst();
        System.out.println(numbers);
        numbers.pollFirst();
        System.out.println(numbers);
        numbers.removeLast();
        System.out.println(numbers);
        numbers.pollLast();
        System.out.println(numbers);

        // The common peek(), offer() and poll() in use
        System.out.println(numbers.offer(11));
        System.out.println(numbers.offer(12));
        System.out.println(numbers.peek());
        System.out.println(numbers.poll());
        System.out.println(numbers.poll());
        System.out.println(numbers.poll());
        System.out.println(numbers.poll());
    }

    public static void priorityQueueNaturalOrdering(){
        // Natural ordering
        Queue<String> names = new PriorityQueue<>();  // alphabetical order only when use iterator
        names.add("V");
        names.add("P");
        names.add("A");
        System.out.println(names);
        names.forEach(System.out::println);

        Iterator<String> itNames = names.iterator();
        while (itNames.hasNext()){
            System.out.println(names.poll() + " ");
        }

        names.forEach(System.out::println);

        Queue<Integer> numbers = new PriorityQueue<>();
        numbers.add(11);
        numbers.add(5);
        numbers.add(2);
        System.out.println(numbers);

        Iterator itNumbers = numbers.iterator();
        while (itNumbers.hasNext()){
            System.out.println(numbers.poll());
        }

    }

    public static void priorityQueueCustomOrdering(){
        Comparator<Book> comparatorTitle = Comparator.comparing(book->book.getTitle());
        Comparator<Book> comparatorPrice = Comparator.comparing(Book::getPrice);

        Queue<Book> bookByTitle = new PriorityQueue<>(comparatorTitle);
        bookByTitle.add(new Book("Java", 55.0));
        bookByTitle.add(new Book("Python", 23.0));
        bookByTitle.add(new Book("C++", 99.0));

        System.out.println(bookByTitle);

        Iterator<Book> itBooks = bookByTitle.iterator();
        while (itBooks.hasNext()){
            System.out.println(bookByTitle.poll());
        }
    }

}

class Book{
    private String title;
    private Double price;

    Book (String title, Double price){
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public Double getPrice() {
        return price;
    }

    public String toString(){
        return "\t" + title + "\t" + price;
    }
}
