package a3;

import java.util.LinkedList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


//unweighted directed graph
public class Prereq {
	private Map<String, List<String>> graph = new HashMap<>();
	
	// this is the method to add a course to the graph
	public void addVertex(String courseCode) {
		graph.putIfAbsent(courseCode, new LinkedList<>());
	}
	// this is a method to add a prerequisite to a course, otherwise known as an directed edge between two courses
	public void addEdge(String sourceCourse, String destinationCourse) {
		List<String> edges = graph.get(sourceCourse);
		edges.add(destinationCourse);
	}
		
		
// this function returns a sequence of courses that are prequisuites of the requested course
	public List<String> getPrerequisitePath(String courseCode){
		    for (Map.Entry<String, List<String>> entry : graph.entrySet()) {
		        if (entry.getValue().contains(courseCode)) {
		            System.out.println(entry.getKey() + " is a prerequisite to " + courseCode);
		        }
		    }
		    return graph.get(courseCode);
		}

// this function returns true if a course is a prerequisite to another course
	public boolean isPrerequisite(String sourceCourse, String destinationCourse) {
		List<String> edges = graph.get(sourceCourse);
		boolean isPrerequisite = edges.contains(destinationCourse);
		System.out.println(isPrerequisite);
		return isPrerequisite;
	}

	
	public static void main(String args[]) {
		
	// this creates a new directed graph
		Prereq graph = new Prereq();

	// add all the vertices (all the courses)
		graph.addVertex("COEN 212");
		graph.addVertex("COEN 231");
		graph.addVertex("COEN 243");
		graph.addVertex("COEN 244");
		graph.addVertex("COEN 311");
		graph.addVertex("COEN 313");
		graph.addVertex("COEN 316");
		graph.addVertex("COEN 317");
		graph.addVertex("COEN 320");
		graph.addVertex("COEN 346");
		graph.addVertex("COEN 352");
		graph.addVertex("COEN 366");
		graph.addVertex("COEN 390");
		graph.addVertex("COEN 413");
		graph.addVertex("COEN 415");
		graph.addVertex("COEN 421");
		graph.addVertex("COEN 422");
		graph.addVertex("COEN 424");
		graph.addVertex("COEN 432");
		graph.addVertex("COEN 433");
		graph.addVertex("COEN 434");
		graph.addVertex("COEN 446");
		graph.addVertex("COEN 447");
		graph.addVertex("COEN 448");
		graph.addVertex("COEN 451");
		graph.addVertex("COEN 490");
		graph.addVertex("COEN 498");
		
		
	// add all the edges (this is a directed graph, so the source class with be the prerequisite to the destination class)
		graph.addEdge("COEN 243", "COEN 244");	
		graph.addEdge("COEN 212", "COEN 311");
		graph.addEdge("COEN 243", "COEN 311");
		graph.addEdge("COEN 212", "COEN 313");
		graph.addEdge("COEN 231", "COEN 313");
		graph.addEdge("COEN 311", "COEN 316");
		graph.addEdge("COEN 313", "COEN 316");
		graph.addEdge("COEN 311", "COEN 317");
		graph.addEdge("COEN 313", "COEN 317");
		graph.addEdge("COEN 346", "COEN 320");
		graph.addEdge("COEN 311", "COEN 346");
		graph.addEdge("COEN 352", "COEN 346");
		graph.addEdge("COEN 231", "COEN 352");
		graph.addEdge("COEN 244", "COEN 352");
		graph.addEdge("COEN 346", "COEN 366");
		graph.addEdge("COEN 311", "COEN 390");
		graph.addEdge("COEN 352", "COEN 390");
		graph.addEdge("COEN 313", "COEN 413");
		graph.addEdge("COEN 317", "COEN 421");
		graph.addEdge("COEN 320", "COEN 421");
		graph.addEdge("COEN 346", "COEN 422");
		graph.addEdge("COEN 346", "COEN 424");
		graph.addEdge("COEN 352", "COEN 432");
		graph.addEdge("COEN 212", "COEN 433");
		graph.addEdge("COEN 244", "COEN 433");
		graph.addEdge("COEN 244", "COEN 434");
		graph.addEdge("COEN 366", "COEN 446");
		graph.addEdge("COEN 317", "COEN 447");
		graph.addEdge("COEN 366", "COEN 447");
		graph.addEdge("COEN 212", "COEN 451");
		
		
		
		
// this is the first test case, this case prints all the prerequisites of COEN 352. You can change the course code and it will print its prerequisites
		List<String> edges = graph.getPrerequisitePath("COEN 352");
	
		
		
// this is a test case of the second function, isPrerequisite. Since COEN 212 is a prereq for COEN 451, this will return true.
	boolean isPrerequisite= graph.isPrerequisite("COEN 212", "COEN 451");
		
		
	}
	}
	







