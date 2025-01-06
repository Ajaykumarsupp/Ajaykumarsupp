public String alarmClock(int day, boolean isVacation) {
    if (isVacation) {
        if (day == 0 || day == 6) {  // Weekend
            return "off";
        } else {  // Weekdays
            return "10:00";
        }
    } else {
        if (day == 0 || day == 6) {  // Weekend
            return "10:00";
        } else {  // Weekdays
            return "7:00";
        }
    }
}
