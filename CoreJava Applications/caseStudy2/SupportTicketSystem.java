package com.evergent.corejava.caseStudy2;
import java.util.*;
public class SupportTicketSystem {
	Deque<String> ticketQueue = new ArrayDeque<>();
	public void addTicket(String ticket) {
		 ticketQueue.add(ticket);
		 System.out.println("Ticket added: " + ticket);
	}
	public void processNextTicket() {
		String ticket = ticketQueue.poll();
		if (ticket != null) {
            System.out.println("Processing ticket: " + ticket);
        } else {
            System.out.println("No tickets to process.");
        }	}
	public void peekNextTicket() {
		String ticket = ticketQueue.peek();
		 if (ticket != null) {
	            System.out.println("Next ticket in line: " + ticket);
	        } else {
	            System.out.println("No tickets available to peek.");
	        }
	}
	public void displayQueue() {
		 if (ticketQueue.isEmpty()) {
	            System.out.println("The ticket queue is empty.");
	        } else {
	            System.out.println("Tickets in queue: " + ticketQueue);
	        }
	}

	public static void main(String[] args) {
		
		SupportTicketSystem s = new SupportTicketSystem();
		s.addTicket("Issue with login");
        s.addTicket("Page not loading");
        s.addTicket("Error message on checkout");
        s.displayQueue();
        s.peekNextTicket();
        s.processNextTicket();
        s.processNextTicket();
        s.processNextTicket();
        s.processNextTicket();
        s.displayQueue();
	}

}
