package com.jd.ark.auth.sso.model;

public class TicketHolder {
	private static final ThreadLocal<DotnetAuthTicket> holder = new ThreadLocal<DotnetAuthTicket>();
	public static void setTicket(DotnetAuthTicket ticket) {
		holder.set(ticket);
	}
	public static DotnetAuthTicket getTicket() {
		return (DotnetAuthTicket) holder.get();
	}
	public static void remove() {
		holder.remove();
	}
}
