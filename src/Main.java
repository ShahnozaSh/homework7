public class Main {

    public static void main(String[] args) {
        HavingSuperAbility[] havingSuperAbilities= { new HavingSuperAbility() {
            @Override
            public void applySuperAbility(String SuperAbilityType) {
                new Medic(),new Magic(), new Warrior()};
        for (int i = 0; i < havingSuperAbilities.length; i++) {
havingSuperAbilities[i].applySuperAbility();
    }
}