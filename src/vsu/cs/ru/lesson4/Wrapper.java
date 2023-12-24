package vsu.cs.ru.lesson4;

import java.util.Objects;

/**
 * �����-������ ��� �������� ������ ����
 */
public class Wrapper {

    public Object content;

    public Wrapper(Object content) {
        Objects.requireNonNull(content);
        this.content = content;
    }

    /**
     * �������� ������
     */
    public void wrap() {
        System.out.println("Wrap object");
        content = new Wrapper(content);
    }

    /**
     * ������� ������
     */
    public void unwrap() {
        System.out.println("Unwrap object");
        if (content instanceof Wrapper wrapper) {
            content = wrapper.getContent();
        } else {
            // ������ ����� ������� ������� � ���, ��� �� ����� �� ����������� ������
            throw new IllegalArgumentException("Content can not be unwrapped");
        }
    }

    public boolean isWrapped() {
        return content instanceof Wrapper;
    }

    public Object getContent() {
        return content;
    }
}
