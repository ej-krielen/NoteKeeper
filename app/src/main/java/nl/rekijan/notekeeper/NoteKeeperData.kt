package nl.rekijan.notekeeper

/**
 * //TODO write description of this class
 *
 * @author Erik-Jan Krielen ej.krielen@gmail.com
 * @since 23-12-2020
 */

class CourseInfo(val courseId: String, val title: String)

class NoteInfo(var course: CourseInfo, var title: String, var text: String)

