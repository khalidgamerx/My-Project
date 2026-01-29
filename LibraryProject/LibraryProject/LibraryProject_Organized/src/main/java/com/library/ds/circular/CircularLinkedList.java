package com.library.ds.circular;

import com.library.ds.BookCollection;
import com.library.model.Book;

/**
 * Circular Linked List implementation.
 * Used for the "History & Literature" section.
 */
public class CircularLinkedList implements BookCollection {

    private static class Node {
        Book data;
        Node next;
        Node(Book data) { this.data = data; }
    }

    private Node head;
    private Node tail;

    @Override
    public void add(Book book) {
        Node newNode = new Node(book);

        if (head == null) {
            head = tail = newNode;
            tail.next = head; // points to itself
            return;
        }

        tail.next = newNode;
        tail = newNode;
        tail.next = head; // last points to first
    }

    @Override
    public void display() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        Node current = head;
        do {
            System.out.println(current.data);
            current = current.next;
        } while (current != head);
    }
}
