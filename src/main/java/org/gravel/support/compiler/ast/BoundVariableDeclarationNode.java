package org.gravel.support.compiler.ast;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigDecimal;
import java.math.BigInteger;
import org.gravel.support.jvm.NonLocalReturn;
import org.gravel.support.compiler.ast.VariableDeclarationNode;
import org.gravel.support.compiler.ast.VariableDeclarationNode.VariableDeclarationNode_Factory;
import org.gravel.support.compiler.ast.TypeNode;
import org.gravel.support.compiler.ast.Reference;
import org.gravel.support.compiler.ast.NodeVisitor;
import org.gravel.support.compiler.ast.Node;
import org.gravel.support.compiler.ast.SourcePrinter;
import org.gravel.support.compiler.ast.SourcePosition;

public class BoundVariableDeclarationNode extends VariableDeclarationNode implements Cloneable {

	public static BoundVariableDeclarationNode_Factory factory = new BoundVariableDeclarationNode_Factory();

	Reference _ownerType;

	public static class BoundVariableDeclarationNode_Factory extends VariableDeclarationNode_Factory {

		public BoundVariableDeclarationNode basicNew() {
			BoundVariableDeclarationNode newInstance = new BoundVariableDeclarationNode();
			newInstance.initialize();
			return newInstance;
		}

		@Override
		public BoundVariableDeclarationNode name_type_(final String _aString, final TypeNode _aVariableNode) {
			return ((BoundVariableDeclarationNode) this.basicNew().initializeName_type_(_aString, _aVariableNode));
		}

		public BoundVariableDeclarationNode name_type_ownerType_(final String _aString, final TypeNode _aTypeNode, final Reference _aReference) {
			return this.basicNew().initializeName_type_ownerType_(_aString, _aTypeNode, _aReference);
		}
	}

	static public BoundVariableDeclarationNode _name_type_(Object receiver, final String _aString, final TypeNode _aVariableNode) {
		return factory.name_type_(_aString, _aVariableNode);
	}

	static public BoundVariableDeclarationNode _name_type_ownerType_(Object receiver, final String _aString, final TypeNode _aTypeNode, final Reference _aReference) {
		return factory.name_type_ownerType_(_aString, _aTypeNode, _aReference);
	}

	@Override
	public <X> X accept_(final NodeVisitor<X> _visitor) {
		return _visitor.visitBoundVariableDeclarationNode_(this);
	}

	@Override
	public BoundVariableDeclarationNode allNodesDo_(final org.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		this.nodesDo_(new org.gravel.support.jvm.Block1<Object, Node>() {

			@Override
			public Object value_(final Node _each) {
				return _each.withAllNodesDo_(_aBlock);
			}
		});
		return this;
	}

	@Override
	public BoundVariableDeclarationNode allNodesDo_pruneWhere_(final org.gravel.support.jvm.Block1<Object, Node> _aBlock, final org.gravel.support.jvm.Block1<Boolean, Node> _pruneBlock) {
		this.nodesDo_(new org.gravel.support.jvm.Block1<Object, Node>() {

			@Override
			public Object value_(final Node _each) {
				if (!_pruneBlock.value_(_each)) {
					return _each.withAllNodesDo_pruneWhere_(_aBlock, _pruneBlock);
				}
				return BoundVariableDeclarationNode.this;
			}
		});
		return this;
	}

	public BoundVariableDeclarationNode copy() {
		try {
			BoundVariableDeclarationNode _temp1 = (BoundVariableDeclarationNode) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	public BoundVariableDeclarationNode_Factory factory() {
		return factory;
	}

	@Override
	public BoundVariableDeclarationNode initializeName_type_(final String _aString, final TypeNode _aVariableNode) {
		_name = _aString;
		_type = _aVariableNode;
		this.initialize();
		return this;
	}

	public BoundVariableDeclarationNode initializeName_type_ownerType_(final String _aString, final TypeNode _aTypeNode, final Reference _aReference) {
		_name = _aString;
		_type = _aTypeNode;
		_ownerType = _aReference;
		this.initialize();
		return this;
	}

	@Override
	public BoundVariableDeclarationNode localVarNamesDo_(final org.gravel.support.jvm.Block1<Object, String> _aBlock) {
		_aBlock.value_(_name);
		return this;
	}

	@Override
	public String name() {
		return _name;
	}

	public Reference ownerType() {
		return _ownerType;
	}

	@Override
	public BoundVariableDeclarationNode prettySourceOn_(final StringBuilder _aStream) {
		SourcePrinter.factory.on_(_aStream).visit_(this);
		return this;
	}

	@Override
	public BoundVariableDeclarationNode printOn_(final StringBuilder _aStream) {
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
	public BoundVariableDeclarationNode pvtSetSourcePosition_(final SourcePosition _aSourcePosition) {
		_sourcePosition = _aSourcePosition;
		return this;
	}

	@Override
	public BoundVariableDeclarationNode sourceOn_(final StringBuilder _aStream) {
		_aStream.append(_name);
		if (_type != null) {
			_aStream.append(' ');
			_aStream.append("{");
			_type.innerSourceOn_(_aStream);
			_aStream.append('}');
		}
		return this;
	}

	@Override
	public TypeNode type() {
		return _type;
	}

	@Override
	public BoundVariableDeclarationNode typeDefsDo_(final org.gravel.support.jvm.Block1<Object, TypeNode> _aBlock) {
		if (_type != null) {
			_type.typeDefsDo_(_aBlock);
		}
		return this;
	}

	@Override
	public BoundVariableDeclarationNode withAllNodesDo_(final org.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		_aBlock.value_(this);
		this.allNodesDo_(_aBlock);
		return this;
	}

	@Override
	public BoundVariableDeclarationNode withAllNodesDo_pruneWhere_(final org.gravel.support.jvm.Block1<Object, Node> _aBlock, final org.gravel.support.jvm.Block1<Boolean, Node> _pruneBlock) {
		_aBlock.value_(this);
		this.allNodesDo_pruneWhere_(_aBlock, _pruneBlock);
		return this;
	}

	@Override
	public BoundVariableDeclarationNode withSourcePosition_(final SourcePosition _aSourcePosition) {
		if (_sourcePosition == _aSourcePosition) {
			return BoundVariableDeclarationNode.this;
		}
		return this.copy().pvtSetSourcePosition_(_aSourcePosition);
	}
}
