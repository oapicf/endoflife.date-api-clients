@isTest
private class OASCycleLtsTest {
    @isTest
    private static void equalsSameInstance() {
        OASCycleLts cycleLts1 = OASCycleLts.getExample();
        OASCycleLts cycleLts2 = cycleLts1;
        OASCycleLts cycleLts3 = new OASCycleLts();
        OASCycleLts cycleLts4 = cycleLts3;

        System.assert(cycleLts1.equals(cycleLts2));
        System.assert(cycleLts2.equals(cycleLts1));
        System.assert(cycleLts1.equals(cycleLts1));
        System.assert(cycleLts3.equals(cycleLts4));
        System.assert(cycleLts4.equals(cycleLts3));
        System.assert(cycleLts3.equals(cycleLts3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCycleLts cycleLts1 = OASCycleLts.getExample();
        OASCycleLts cycleLts2 = OASCycleLts.getExample();
        OASCycleLts cycleLts3 = new OASCycleLts();
        OASCycleLts cycleLts4 = new OASCycleLts();

        System.assert(cycleLts1.equals(cycleLts2));
        System.assert(cycleLts2.equals(cycleLts1));
        System.assert(cycleLts3.equals(cycleLts4));
        System.assert(cycleLts4.equals(cycleLts3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCycleLts cycleLts1 = OASCycleLts.getExample();
        OASCycleLts cycleLts2 = new OASCycleLts();

        System.assertEquals(false, cycleLts1.equals('foo'));
        System.assertEquals(false, cycleLts2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCycleLts cycleLts1 = OASCycleLts.getExample();
        OASCycleLts cycleLts2 = new OASCycleLts();
        OASCycleLts cycleLts3;

        System.assertEquals(false, cycleLts1.equals(cycleLts3));
        System.assertEquals(false, cycleLts2.equals(cycleLts3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCycleLts cycleLts1 = OASCycleLts.getExample();
        OASCycleLts cycleLts2 = new OASCycleLts();

        System.assertEquals(cycleLts1.hashCode(), cycleLts1.hashCode());
        System.assertEquals(cycleLts2.hashCode(), cycleLts2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCycleLts cycleLts1 = OASCycleLts.getExample();
        OASCycleLts cycleLts2 = OASCycleLts.getExample();
        OASCycleLts cycleLts3 = new OASCycleLts();
        OASCycleLts cycleLts4 = new OASCycleLts();

        System.assert(cycleLts1.equals(cycleLts2));
        System.assert(cycleLts3.equals(cycleLts4));
        System.assertEquals(cycleLts1.hashCode(), cycleLts2.hashCode());
        System.assertEquals(cycleLts3.hashCode(), cycleLts4.hashCode());
    }
}
