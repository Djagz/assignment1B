package gitMergeConflict;


public class SomeClass {

        private ArrayList<String> events = new ArrayList<String>();

        public void createEvents() {
		events.add("We're going to a movie on Saturday");
		events.add("Study session on Sunday - Jim's house");
	}
	
	public void fnOne(){
		System.out.println("On the other hand, you have different fingers");
	}

        public void upcomingEvents(){
                System.out.println("Upcoming Events - Please join us!");
		for (String event : events)
			System.out.println(event);
	}
	
	public static void main(String[] args){
		SomeClass sc = new SomeClass();
		sc.fnOne();
                sc.upcomingEvents();
                sc.createEvents();

}
