package com.ocp.exception.exercise;

public class ChainException {

  public static void main(String[] args) throws Exception {
    getLeave();
  }

  static void getLeave() throws Exception {
    try {
      howIsTeamLead();
    } catch (TeamLeadUpsetException e) {
      e.printStackTrace();
      throw new NoLeaveGrantedException("Leave not sanctioned.", e);
    }
  }

  static void howIsTeamLead() throws TeamLeadUpsetException {
    throw new TeamLeadUpsetException("Team Lead Upset");
  }
}

class TeamLeadUpsetException01 extends Exception {
  public TeamLeadUpsetException01(String message) {
    super(message);
  }
}

class NoLeaveGrantedException01 extends Exception {
  public NoLeaveGrantedException01(String message) {
    super(message);
  }
}
