package com.library.app;

import com.library.ds.circular.CircularLinkedList;
import com.library.ds.doubly.DoublyLinkedList;
import com.library.ds.singly.SinglyLinkedList;
import com.library.model.Book;
import com.library.sections.LibrarySection;

public class LibraryProject {

    public static void main(String[] args) {

        // Create the lists (each section uses a different linked list type)
        SinglyLinkedList religiousSection = new SinglyLinkedList();
        DoublyLinkedList scienceSection = new DoublyLinkedList();
        CircularLinkedList historySection = new CircularLinkedList();

        // ------------------------------------------
        // Seed data (at least 5 books per section)
        // ------------------------------------------

        // 1) Religious books
        religiousSection.add(new Book(101, "The Holy Quran", "Word of Allah"));
        religiousSection.add(new Book(102, "Sahih al-Bukhari", "Imam al-Bukhari"));
        religiousSection.add(new Book(103, "Riyadh as-Salihin", "Imam an-Nawawi"));
        religiousSection.add(new Book(104, "Ar-Raheeq Al-Makhtum", "Safi-ur-Rahman al-Mubarakpuri"));
        religiousSection.add(new Book(105, "Fiqh as-Sunnah", "Sayyid Sabiq"));

        // 2) Science books
        scienceSection.add(new Book(201, "A Brief History of Time", "Stephen Hawking"));
        scienceSection.add(new Book(202, "Cosmos", "Carl Sagan"));
        scienceSection.add(new Book(203, "On the Origin of Species", "Charles Darwin"));
        scienceSection.add(new Book(204, "Physics for Everyone", "Lev Landau"));
        scienceSection.add(new Book(205, "The Selfish Gene", "Richard Dawkins"));

        // 3) History & literature books
        historySection.add(new Book(301, "Muqaddimah", "Ibn Khaldun"));
        historySection.add(new Book(302, "Al-Bidaya wa al-Nihaya", "Ibn Kathir"));
        historySection.add(new Book(303, "War and Peace", "Leo Tolstoy"));
        historySection.add(new Book(304, "The Days", "Taha Hussein"));
        historySection.add(new Book(305, "One Thousand and One Nights", "Folk Heritage"));

        // ------------------------------------------
        // Display UI
        // ------------------------------------------
        System.out.println("==========================================");
        System.out.println("        Welcome to the Library System     ");
        System.out.println("==========================================
");

        System.out.println(">>> " + LibrarySection.RELIGIOUS.displayName());
        System.out.println("------------------------------------------");
        religiousSection.display();
        System.out.println();

        System.out.println(">>> " + LibrarySection.SCIENCE.displayName());
        System.out.println("------------------------------------------");
        scienceSection.display();
        System.out.println();

        System.out.println(">>> " + LibrarySection.HISTORY_LITERATURE.displayName());
        System.out.println("------------------------------------------");
        historySection.display();
        System.out.println();

        System.out.println("==========================================");
        System.out.println("        All books displayed successfully  ");
        System.out.println("==========================================");
    }
}
