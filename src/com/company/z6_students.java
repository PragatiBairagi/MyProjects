package com.company;

import java.util.Objects;

public class z6_students implements Comparable<z6_students>{

        String name;
        int rollNo;

        public z6_students(String name, int rollNo){
            this.name = name;
            this.rollNo = rollNo ;
        }

    @Override
    public String toString() {
        return "z6_students{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        z6_students that = (z6_students) o;
        return rollNo == that.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }

    @Override
    public int compareTo(z6_students that) {
        return this.rollNo - that.rollNo;
    }
}
