class AnnalynsInfiltration{

    public static boolean canFastAttack(boolean knightIsAwake){
        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake){
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

    public static boolean canSignalPrisoner(boolean prisonerIsAwake, boolean archerIsAwake){
        return prisonerIsAwake && !knightIsAwake;
    }

    public static boolean canFreePrisoner(boolean petDogIsPresent, boolean prisonerIsAwake, boolean archerIsAwake, boolean knightIsAwake){
        return petDogIsPresent && !archerIsAwake || prisonerIsAwake && !knightIsAwake && !archerIsAwake;
    }

}