package switchcase;


public class WeekDay {
	
	public String getWeekDay(String day){
		String taskToDo = "";
		day = day.toUpperCase();
		switch(day){
		
		case "MONDAY": taskToDo = "Start with CodeLab"; break;
		case "TUESDAY": taskToDo = "Join Mentoring session-1 by Jawad Newaj";break;
		case "WEDNESDAY": taskToDo = "Join Mentoring session-2 by Kaya Begum";break;
		case "THURSDAY": taskToDo = "Home Work is due";break;
		case "FRIDAY": taskToDo = "Prepare for the Quiz and co,mplete the quiz on Friday night";break;
		case "SATURDAY": taskToDo = "Our Java class is on Session";break;
		case "SUNDAY": taskToDo = "Review of CodeLab Assignement";break;
		default: taskToDo = "Out of Week Days";break;
	
		}
		
		return taskToDo;
	}

}