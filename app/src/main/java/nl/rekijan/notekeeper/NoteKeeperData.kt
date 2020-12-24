package nl.rekijan.notekeeper

/**
 * @author Erik-Jan Krielen ej.krielen@gmail.com
 * @since 23-12-2020
 */

data class CourseInfo(val courseId: String, val title: String) {
    override fun toString(): String {
        return title
    }
}

data class NoteInfo(var course: CourseInfo? = null, var title: String? = null, var text: String? = null)
