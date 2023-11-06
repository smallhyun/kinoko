package kinoko.world.job;

public enum Job {
    // EXPLORERS --------------------------------------------------------------
    BEGINNER(0),
    WARRIOR(100),
    FIGHTER(110),
    CRUSADER(111),
    HERO(112),
    PAGE(120),
    WHITE_KNIGHT(121),
    PALADIN(122),
    SPEARMAN(130),
    DRAGON_KNIGHT(131),
    DARK_KNIGHT(132),
    MAGICIAN(200),
    FP_WIZARD(210),
    FP_MAGE(211),
    FP_ARCH_MAGE(212),
    IL_WIZARD(220),
    IL_MAGE(221),
    IL_ARCH_MAGE(222),
    CLERIC(230),
    PRIEST(231),
    BISHOP(232),
    ARCHER(300),
    HUNTER(310),
    RANGER(311),
    BOW_MASTER(312),
    CROSSBOWMAN(320),
    SNIPER(321),
    MARKSMAN(322),
    ROGUE(400),
    ASSASSIN(410),
    HERMIT(411),
    NIGHT_LORD(412),
    BANDIT(420),
    CHIEF_BANDIT(421),
    SHADOWER(422),
    BLADE_RECRUIT(430),
    BLADE_ACOLYTE(431),
    BLADE_SPECIALIST(432),
    BLADE_LORD(433),
    BLADE_MASTER(434),
    PIRATE(500),
    BRAWLER(510),
    MARAUDER(511),
    BUCCANEER(512),
    GUNSLINGER(520),
    OUTLAW(521),
    CORSAIR(522),

    // CYGNUS KNIGHTS ---------------------------------------------------------
    NOBLESSE(1000),
    DAWN_WARRIOR_1(1100),
    DAWN_WARRIOR_2(1110),
    DAWN_WARRIOR_3(1111),
    BLAZE_WIZARD_1(1200),
    BLAZE_WIZARD_2(1210),
    BLAZE_WIZARD_3(1211),
    WIND_ARCHER_1(1300),
    WIND_ARCHER_2(1310),
    WIND_ARCHER_3(1311),
    NIGHT_WALKER_1(1400),
    NIGHT_WALKER_2(1410),
    NIGHT_WALKER_3(1411),
    THUNDER_BREAKER_1(1500),
    THUNDER_BREAKER_2(1510),
    THUNDER_BREAKER_3(1511),

    // ARAN -------------------------------------------------------------------
    ARAN_BEGINNER(2000),
    ARAN_1(2100),
    ARAN_2(2110),
    ARAN_3(2111),
    ARAN_4(2112),

    // EVAN -------------------------------------------------------------------
    EVEN_BEGINNER(2001),
    EVAN_1(2200),
    EVAN_2(2210),
    EVAN_3(2111),
    EVAN_4(2112),
    EVAN_5(2113),
    EVAN_6(2114),
    EVAN_7(2115),
    EVAN_8(2116),
    EVAN_9(2117),
    EVAN_10(2118),

    // RESISTANCE -------------------------------------------------------------
    CITIZEN(3000),
    BATTLE_MAGE_1(3200),
    BATTLE_MAGE_2(3210),
    BATTLE_MAGE_3(3211),
    BATTLE_MAGE_4(3212),
    WILD_HUNTER_1(3300),
    WILD_HUNTER_2(3310),
    WILD_HUNTER_3(3311),
    WILD_HUNTER_4(3312),
    MECHANIC_1(3500),
    MECHANIC_2(3510),
    MECHANIC_3(3511),
    MECHANIC_4(3512);

    private final short jobId;

    Job(int jobId) {
        this.jobId = (short) jobId;
    }

    public short getJobId() {
        return jobId;
    }
}