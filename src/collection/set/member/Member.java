package collection.set.member;

import collection.set.MyHashSetV2;

import java.util.Objects;

public class Member {

    private String id;

    public Member(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(id, member.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                '}';
    }

    public static class HashAndEqualsMain1 {

        public static void main(String[] args) {
            MyHashSetV2 set = new MyHashSetV2(10);
            MemberNoHashNoEq m1 = new MemberNoHashNoEq("A");
            MemberNoHashNoEq m2 = new MemberNoHashNoEq("A");
            System.out.println("m1.hashCode() = " + m1.hashCode());
            System.out.println("m2.hashCode() = " + m2.hashCode());
            System.out.println("m1.equals(m2) = " + m1.equals(m2));

            set.add(m1);
            set.add(m2);
            System.out.println(set);

            // 검색 실패
            MemberNoHashNoEq searchValue = new MemberNoHashNoEq("A");
            System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
            boolean contains = set.contains(searchValue);
            System.out.println("contains = " + contains);
        }
    }
}
