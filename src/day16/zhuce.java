package src.day16;

class zhuce {
    private String name;
    private String mima;
    private String email;

    public zhuce(String name, String mima, String email) {
        if (name.length() >= 2 && name.length() <= 4) {
            this.name = name;
            if (mima.length() != 6) {
                throw new RuntimeException("密码应为6位");
            } else {
                if (this.isDigitl(mima)) {
                    this.mima = mima;
                }

                if (this.Email(email) == -1) {
                    throw new RuntimeException("@不能在第一位");
                } else if (this.Email(email) == 1) {
                    throw new RuntimeException("@应在.前面");
                } else {
                    this.email = email;
                }
            }
        } else {
            throw new RuntimeException("用户名范围2-4");
        }
    }

    public boolean isDigitl(String s) {
        char[] ch = s.toCharArray();

        for(int i = 0; i < s.length(); ++i) {
            if (!Character.isDigit(ch[i])) {
                return false;
            }
        }

        return true;
    }

    public int Email(String s) {
        int i = s.indexOf(64);
        int j = s.indexOf(46);
        if (i <= 0) {
            return -1;
        } else {
            return i >= j ? 1 : 0;
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMima() {
        return this.mima;
    }

    public void setMima(String mima) {
        this.mima = mima;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
