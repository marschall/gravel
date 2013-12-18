package org.gravel.support.compiler.ast;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigDecimal;
import java.math.BigInteger;
import org.gravel.support.jvm.NonLocalReturn;
import org.gravel.support.compiler.ast.NodeCopier;
import org.gravel.support.compiler.ast.NodeCopier.NodeCopier_Factory;
import java.util.Map;
import org.gravel.support.compiler.ast.VariableScopeAnalyzerState;
import java.util.HashMap;
import org.gravel.support.compiler.ast.AssignmentNode;
import org.gravel.support.compiler.ast.Expression;
import org.gravel.support.compiler.ast.VariableNode;
import org.gravel.support.compiler.ast.BlockNode;
import org.gravel.support.compiler.ast.VariableDeclarationNode;
import org.gravel.support.compiler.ast.SequenceNode;
import org.gravel.support.compiler.ast.TypeNode;
import org.gravel.support.compiler.ast.VariableScopeAnalyzerStateDefined;
import org.gravel.support.compiler.ast.Statement;
import java.util.Map;
import java.util.Map.*;
import org.gravel.support.compiler.ast.VariableToHolderRewriter;

public class NonLocalTempWritesToHolderConverter extends NodeCopier implements Cloneable {

	public static NonLocalTempWritesToHolderConverter_Factory factory = new NonLocalTempWritesToHolderConverter_Factory();

	NonLocalTempWritesToHolderConverter _parent;

	Map<String, VariableScopeAnalyzerState> _temps;

	public static class NonLocalTempWritesToHolderConverter_Factory extends NodeCopier_Factory {

		public NonLocalTempWritesToHolderConverter basicNew() {
			NonLocalTempWritesToHolderConverter newInstance = new NonLocalTempWritesToHolderConverter();
			newInstance.initialize();
			return newInstance;
		}

		public NonLocalTempWritesToHolderConverter parent_(final NonLocalTempWritesToHolderConverter _aVariableScopeAnalyzer) {
			return this.basicNew().initializeParent_(_aVariableScopeAnalyzer);
		}
	}

	static public NonLocalTempWritesToHolderConverter _parent_(Object receiver, final NonLocalTempWritesToHolderConverter _aVariableScopeAnalyzer) {
		return factory.parent_(_aVariableScopeAnalyzer);
	}

	public NonLocalTempWritesToHolderConverter addBlockVariableRead_(final String _aString) {
		if (!_temps.containsKey(_aString)) {
			if (_parent == null) {
				return NonLocalTempWritesToHolderConverter.this;
			}
			_parent.addBlockVariableRead_(_aString);
			return NonLocalTempWritesToHolderConverter.this;
		}
		_temps.put(_aString, _temps.get(_aString).withBlockRead());
		return this;
	}

	public NonLocalTempWritesToHolderConverter addBlockVariableWrite_(final String _aString) {
		if (!_temps.containsKey(_aString)) {
			if (_parent == null) {
				return NonLocalTempWritesToHolderConverter.this;
			}
			_parent.addBlockVariableWrite_(_aString);
			return NonLocalTempWritesToHolderConverter.this;
		}
		_temps.put(_aString, _temps.get(_aString).withBlockWrite());
		return this;
	}

	public NonLocalTempWritesToHolderConverter addVariableRead_(final String _aString) {
		if (!_temps.containsKey(_aString)) {
			if (_parent == null) {
				return NonLocalTempWritesToHolderConverter.this;
			}
			_parent.addBlockVariableRead_(_aString);
			return NonLocalTempWritesToHolderConverter.this;
		}
		_temps.put(_aString, _temps.get(_aString).withLocalRead());
		return this;
	}

	public NonLocalTempWritesToHolderConverter addVariableWrite_(final String _aString) {
		if (!_temps.containsKey(_aString)) {
			if (_parent == null) {
				return NonLocalTempWritesToHolderConverter.this;
			}
			_parent.addBlockVariableWrite_(_aString);
			return NonLocalTempWritesToHolderConverter.this;
		}
		_temps.put(_aString, _temps.get(_aString).withLocalWrite());
		return this;
	}

	public NonLocalTempWritesToHolderConverter copy() {
		try {
			NonLocalTempWritesToHolderConverter _temp1 = (NonLocalTempWritesToHolderConverter) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	public NonLocalTempWritesToHolderConverter_Factory factory() {
		return factory;
	}

	@Override
	public NonLocalTempWritesToHolderConverter initialize() {
		super.initialize();
		_temps = new java.util.HashMap<String, VariableScopeAnalyzerState>();
		return this;
	}

	public NonLocalTempWritesToHolderConverter initializeParent_(final NonLocalTempWritesToHolderConverter _aVariableScopeAnalyzer) {
		_parent = _aVariableScopeAnalyzer;
		this.initialize();
		return this;
	}

	public NonLocalTempWritesToHolderConverter parent() {
		return _parent;
	}

	@Override
	public Expression visitAssignmentNode_(final AssignmentNode _anObject) {
		this.addVariableWrite_(_anObject.variable().name());
		return AssignmentNode.factory.variable_value_(VariableNode.factory.name_(_anObject.variable().name()), ((Expression) this.visit_(_anObject.value())));
	}

	@Override
	public BlockNode visitBlockNode_(final BlockNode _anObject) {
		final NonLocalTempWritesToHolderConverter _sub;
		_sub = NonLocalTempWritesToHolderConverter.factory.parent_(this);
		return BlockNode.factory.arguments_body_returnType_(org.gravel.support.jvm.ArrayExtensions.collect_(_anObject.arguments(), ((org.gravel.support.jvm.Block1<VariableDeclarationNode, VariableDeclarationNode>) (new org.gravel.support.jvm.Block1<VariableDeclarationNode, VariableDeclarationNode>() {

			@Override
			public VariableDeclarationNode value_(final VariableDeclarationNode _each) {
				return (VariableDeclarationNode) _sub.visit_(_each);
			}
		}))), ((SequenceNode) _sub.visit_(_anObject.body())), ((TypeNode) _sub.visit_(_anObject.returnType())));
	}

	@Override
	public SequenceNode visitSequenceNode_(final SequenceNode _anObject) {
		final SequenceNode[] _node;
		_node = new SequenceNode[1];
		_node[0] = SequenceNode.factory.temporaries_statements_(org.gravel.support.jvm.ArrayExtensions.collect_(_anObject.temporaries(), ((org.gravel.support.jvm.Block1<VariableDeclarationNode, VariableDeclarationNode>) (new org.gravel.support.jvm.Block1<VariableDeclarationNode, VariableDeclarationNode>() {

			@Override
			public VariableDeclarationNode value_(final VariableDeclarationNode _each) {
				_temps.put(_each.name(), VariableScopeAnalyzerStateDefined.factory.basicNew());
				return (VariableDeclarationNode) NonLocalTempWritesToHolderConverter.this.visit_(_each);
			}
		}))), org.gravel.support.jvm.ArrayExtensions.collect_(_anObject.statements(), ((org.gravel.support.jvm.Block1<Statement, Statement>) (new org.gravel.support.jvm.Block1<Statement, Statement>() {

			@Override
			public Statement value_(final Statement _each) {
				return (Statement) NonLocalTempWritesToHolderConverter.this.visit_(_each);
			}
		}))));
		for (final Map.Entry<String, VariableScopeAnalyzerState> _temp1 : _temps.entrySet()) {
			String _varName = _temp1.getKey();
			VariableScopeAnalyzerState _state = _temp1.getValue();
			if (_state.isUndecided()) {
				_node[0] = ((SequenceNode) VariableToHolderRewriter.factory.varName_(_varName).visit_(_node[0]));
			}
		}
		return _node[0];
	}

	@Override
	public Expression visitVariableNode_(final VariableNode _anObject) {
		this.addVariableRead_(_anObject.name());
		return VariableNode.factory.name_(_anObject.name());
	}
}
