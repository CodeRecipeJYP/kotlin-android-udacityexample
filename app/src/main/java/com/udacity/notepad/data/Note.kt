package com.udacity.notepad.data

import java.util.Date

data class Note(
    var id: Int = -1,
    var text: String? = null,
    var isPinned: Boolean = false,
    var createdAt: Date = Date(),
    var updatedAt: Date? = null
)

// Playground
fun demoDataClasses() {
    val note = Note(text = "This is a note that I wasn't able to have used on my company project.")
    note == note.copy()
    note != note.copy(text = "Little changes here", isPinned = false)
}