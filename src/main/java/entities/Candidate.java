package entities;


import java.util.Objects;

public class Candidate {
    private String name;
    private Integer votes;

    public Candidate(String name, Integer votes) {
        this.name = name;
        this.votes = votes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getVotes() {
        return votes;
    }

    public void setVotes(Integer votes) {
        this.votes = votes;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Candidate candidate = (Candidate) object;
        return Objects.equals(getName(), candidate.getName()) && Objects.equals(getVotes(), candidate.getVotes());
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(getName());
        result = 31 * result + Objects.hashCode(getVotes());
        return result;
    }
}
