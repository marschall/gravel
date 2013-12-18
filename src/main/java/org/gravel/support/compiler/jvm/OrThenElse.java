package org.gravel.support.compiler.jvm;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigDecimal;
import java.math.BigInteger;
import org.gravel.support.jvm.NonLocalReturn;
import org.gravel.support.compiler.jvm.Fork;
import org.gravel.support.compiler.jvm.Fork.Fork_Factory;
import org.gravel.support.compiler.jvm.Frame;
import org.gravel.support.compiler.jvm.PushTrue;
import org.gravel.support.compiler.jvm.PushFalse;
import org.gravel.support.compiler.jvm.JVMInstructionVisitor;
import org.gravel.support.compiler.jvm.JVMStack;
import org.gravel.support.compiler.jvm.JVMInstruction;
import org.gravel.support.compiler.jvm.JVMType;

public class OrThenElse extends Fork implements Cloneable {

	public static OrThenElse_Factory factory = new OrThenElse_Factory();

	Frame _left;

	Frame _right;

	public static class OrThenElse_Factory extends Fork_Factory {

		public OrThenElse basicNew() {
			OrThenElse newInstance = new OrThenElse();
			newInstance.initialize();
			return newInstance;
		}

		public OrThenElse left_right_(final Frame _aFrame, final Frame _aFrame2) {
			return this.basicNew().initializeLeft_right_(_aFrame, _aFrame2);
		}

		@Override
		public OrThenElse r_boolean() {
			return ((OrThenElse) this.trueFrame_falseFrame_(PushTrue.factory.basicNew().asFrame(), PushFalse.factory.basicNew().asFrame()));
		}

		@Override
		public OrThenElse trueFrame_falseFrame_(final Frame _aFrame, final Frame _aFrame2) {
			return ((OrThenElse) this.basicNew().initializeTrueFrame_falseFrame_(_aFrame, _aFrame2));
		}
	}

	static public OrThenElse _left_right_(Object receiver, final Frame _aFrame, final Frame _aFrame2) {
		return factory.left_right_(_aFrame, _aFrame2);
	}

	static public OrThenElse _r_boolean(Object receiver) {
		return factory.r_boolean();
	}

	static public OrThenElse _trueFrame_falseFrame_(Object receiver, final Frame _aFrame, final Frame _aFrame2) {
		return factory.trueFrame_falseFrame_(_aFrame, _aFrame2);
	}

	@Override
	public <X> X accept_(final JVMInstructionVisitor<X> _visitor) {
		return _visitor.visitOrThenElse_(this);
	}

	public OrThenElse copy() {
		try {
			OrThenElse _temp1 = (OrThenElse) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public JVMInstruction effectStack_(final JVMStack _aJVMStack) {
		return this.pushTypeOnStack_(_aJVMStack);
	}

	public OrThenElse_Factory factory() {
		return factory;
	}

	@Override
	public OrThenElse initialize() {
		if (_trueFrame == null) {
			_trueFrame = PushTrue.factory.basicNew().asFrame();
		}
		if (_falseFrame == null) {
			_falseFrame = PushFalse.factory.basicNew().asFrame();
		}
		return this;
	}

	public OrThenElse initializeLeft_right_(final Frame _aFrame, final Frame _aFrame2) {
		_left = _aFrame;
		_right = _aFrame2;
		this.initialize();
		return this;
	}

	@Override
	public OrThenElse initializeTrueFrame_falseFrame_(final Frame _aFrame, final Frame _aFrame2) {
		_trueFrame = _aFrame;
		_falseFrame = _aFrame2;
		this.initialize();
		return this;
	}

	public Frame left() {
		return _left;
	}

	@Override
	public OrThenElse printOn_(final StringBuilder _aStream) {
		final String _title;
		_title = this.factory().toString();
		_aStream.append(org.gravel.support.jvm.CharacterExtensions.isVowel(_title.charAt(0)) ? "an " : "a ");
		_aStream.append(_title);
		_aStream.append('[');
		this.sourceOn_(_aStream);
		_aStream.append(']');
		return this;
	}

	@Override
	public OrThenElse pushTypeOnStack_(final JVMStack _aJVMStack) {
		if (!this.type().isBottomType()) {
			_aJVMStack.push_(OrThenElse.this.type());
		}
		return this;
	}

	public Frame right() {
		return _right;
	}

	@Override
	public OrThenElse sourceOn_(final StringBuilder _aStream) {
		return this;
	}

	@Override
	public OrThenElse withReturnType_(final JVMType _aType) {
		if (org.gravel.support.jvm.ObjectExtensions.equals_(this.type(), _aType)) {
			return OrThenElse.this;
		}
		throw new RuntimeException("niy");
	}
}
