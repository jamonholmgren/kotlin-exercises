fun isLeapYear(yearnum: Int): Boolean {
  if (yearnum % 400 == 0) return true
  if (yearnum % 100 == 0) return false
  return (yearnum % 4) == 0
}

class Year (yearnum: Int) {
  val isLeap: Boolean = isLeapYear(yearnum)
}
