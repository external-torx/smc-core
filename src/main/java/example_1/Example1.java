package example_1;

public class Example1 {

	private Example1Context _fsm;
    private boolean         _is_acceptable;

    public Example1() {
        _fsm = new Example1Context(this);
        _is_acceptable = false;

        // Uncomment to see debug output.
        // _fsm.setDebugFlag(true);
    }

    public void Acceptable() {
        _is_acceptable = true;
    }

    public boolean CheckString(String string) {
        int i, Length;
        _fsm.enterStartState();

        for (i = 0, Length = string.length(); i < Length; ++i) {
            switch (string.charAt(i)) {
                case '0':
                    _fsm.Zero();
                    break;

                case '1':
                    _fsm.One();
                    break;

                default:
                    _fsm.Unknown();
                    break;
            }
        }

        _fsm.EOS();

        return _is_acceptable;
    }

    public void Unacceptable() {
        _is_acceptable = false;
    }

}
