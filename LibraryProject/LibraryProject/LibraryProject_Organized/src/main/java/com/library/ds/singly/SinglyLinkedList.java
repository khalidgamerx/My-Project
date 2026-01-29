package com.library.ds.singly;

import com.library.ds.BookCollection;
import com.library.model.Book;

/**
 * Singly Linked List implementation.
 * Used for the "Religious Books" section.
 */
public class SinglyLinkedList implements BookCollection {

    /** Node is kept private to keep the project clean and encapsulated. */
    private static class Node {
        Book data;
        Node next;
        Node(Book data) { this.data = data; }
    }

    private Node head;

    @Override
    public void add(Book book) {
        Node newNode = new Node(book);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) current = current.next;
        current.next = newNode;
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
