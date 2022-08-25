class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> ransomNoteMap = new HashMap<>();
        Map<Character, Integer> magazineMap = new HashMap<>();

        for (char letter : magazine.toCharArray()) {
            magazineMap.put(letter, magazineMap.getOrDefault(letter, 0) + 1);
        }

        for (char letter : ransomNote.toCharArray()) {
            ransomNoteMap.put(letter, ransomNoteMap.getOrDefault(letter, 0) + 1);
            if (ransomNoteMap.get(letter) > magazineMap.getOrDefault(letter, 0))
                return false;
        }

        return true;
    }
}