package com.library.ds.doubly;

import com.library.ds.BookCollection;
import com.library.model.Book;

/**
 * Doubly Linked List implementation.
 * Used for the "Science Books" section.
 */
public class DoublyLinkedList implements BookCollection {

    private static class Node {
        Book data;
        Node next;
        Node prev;
        Node(Book data) { this.data = data; }
    }

    private Node head;
    private Node tail;

    @Override
    public void add(Book book) {
        Node newNode = new Node(book);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    @Override
    public void display() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
