package homework.collection;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        FootballTeamMember footballTeamMember = new FootballTeamMember(1, "Rud");
        FootballTeamMember footballTeamMember1 = new FootballTeamMember(2, "Roberto");
        FootballTeamMember footballTeamMember2 = new FootballTeamMember(7, "Ronaldo");
        FootballTeamMember footballTeamMember3 = new FootballTeamMember(10, "Messi");
        Map<Integer, String> playersMap = new HashMap<>();
        playersMap.put(1, "Alex");
        playersMap.put(2, "Bob");
        playersMap.put(3, "Josh");
        List<FootballTeamMember> team = new ArrayList<>();
        team.add(footballTeamMember);
        team.add(footballTeamMember1);
        team.add(footballTeamMember2);
        team.add(footballTeamMember3);
        MapExample.createFootballTeam(team);
        System.out.println(removeFromMap(playersMap, 5));
        System.out.println(playersMap);
        printAllMemberNames(playersMap);
        printAllMembers(playersMap);
    }

    //Ունենք FootballTeamMember-ի լիստ, պետք է ստանանք HashMap որտեղ կեյ-ը կլինի խաղացողի համարը, իսկ վելյուն իրա անունը։
    static Map<Integer, String> createFootballTeam(List<FootballTeamMember> members) {
        Map<Integer, String> map = new HashMap<>();
        for (FootballTeamMember member : members) {
            map.put(member.number, member.name);

        }
        return map;
    }

    //Մեթոդի մեջ պետք է տրված մապ-ից ջնջենք removedNumber համարը եթե կա, ու վերադարձնենք true, եթե չկա վերադարձնենք false
    static boolean removeFromMap(Map<Integer, String> memberMap, Integer removedNumber) {
        if (memberMap.containsKey(removedNumber)) {
            memberMap.remove(removedNumber);
            return true;
        } else {
            return false;
        }
    }

    //Մեթոդով տպելու ենք միայն անունները
    static void printAllMemberNames(Map<Integer, String> memberMap) {
        System.out.println(memberMap.values());
    }

    //Մեթոդով տպելու ենք թե համարը, թե խաղացողի անունը հետյալ ձև՝
    // 11 - Poxos Poxosyan
    // 12 - Petros Petrosyan
    static void printAllMembers(Map<Integer, String> memberMap) {
        Set<Map.Entry<Integer, String>> entries = memberMap.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }


    static class FootballTeamMember {
        private int number;
        private String name;

        public FootballTeamMember(int number, String name) {
            this.number = number;
            this.name = name;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}