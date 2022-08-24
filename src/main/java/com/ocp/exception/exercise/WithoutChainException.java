package com.ocp.exception.exercise;

public class WithoutChainException {

  public static void main(String[] args) throws Exception {
    getLeave();
  }

  static void getLeave() throws Exception {
    try {
      howIsTeamLead();
    } catch (TeamLeadUpsetException e) {
      e.printStackTrace();
      throw new NoLeaveGrantedException("Leave not sanctioned.");
    }
  }

  static void howIsTeamLead() throws TeamLeadUpsetException {
    throw new TeamLeadUpsetException("Team Lead Upset");
  }
}

class TeamLeadUpsetException extends Exception {
  public TeamLeadUpsetException(String message) {
    super(message);
  }
}

class NoLeaveGrantedException extends Exception {
  public NoLeaveGrantedException(String message) {
    super(message);
  }

  public NoLeaveGrantedException(String message, Throwable throwable) {
    super(message, throwable);
  }
}
