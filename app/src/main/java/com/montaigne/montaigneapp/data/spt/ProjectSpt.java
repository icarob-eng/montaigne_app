package com.montaigne.montaigneapp.data.spt;

import com.montaigne.montaigneapp.data.Coordinate;
import com.montaigne.montaigneapp.data.Project;

import java.util.List;

public class ProjectSpt extends Project {

    private int holeNumber;
    private List<PollSpt> polls;

    public ProjectSpt() {}

    public ProjectSpt(Long id, String name, String client, String company, String technician,
                      String phoneNumber, String starData, Coordinate coordinate, int holeNumber,
                      List<PollSpt> samples) {

        super(id, name, client, company, technician, phoneNumber, starData, coordinate);
        this.holeNumber = holeNumber;
        this.polls = samples;
    }

    public int getHoleNumber() {
        return holeNumber;
    }

    public void setHoleNumber(int holeNumber) {
        this.holeNumber = holeNumber;
    }

    public List<PollSpt> getPolls() {
        return polls;
    }

    public void setPolls(List<PollSpt> polls) {
        this.polls = polls;
    }
}
