package com.library.sections;

/** Library sections used for display only. */
public enum LibrarySection {
    RELIGIOUS("Religious Books Section (Singly Linked List)"),
    SCIENCE("Science Books Section (Doubly Linked List)"),
    HISTORY_LITERATURE("History & Literature Section (Circular Linked List)");

    private final String displayName;

    LibrarySection(String displayName) {
        this.displayName = displayName;
    }

    public String displayName() {
        return displayName;
    }
}
