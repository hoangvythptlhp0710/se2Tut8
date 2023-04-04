package to_dos.factory;

// Create the Admission class to generate object of sub-classes
class Admission {
	// use admittingCourse method to get object of type Course
	public Course admittingCourse(String courseName) {
		//TO-DO: if courseName is null => return null

        if (courseName == null) {
            return null;
        }

        else if (courseName.equalsIgnoreCase("Civil Service")) {
            return new CivilService();
        }

        else if (courseName.equalsIgnoreCase("Computer")) {
            return new Computer();
        }

        else if (courseName.equalsIgnoreCase("Health")) {
            return new Health();
        }

        else {
            return null;
        }

		//TO-DO: if courseName is similar to 1 of 3 sub-class's name => return corresponding objects

		//return null for default
	}
} 