'use client';
import React, { useState } from "react";
import TodoForm from "../components/TodoForm";
import TodoList from "../components/TodoList";

const TodoContainer = () => {
    const [items, setItems] = useState([]);

    return (
        <>
            <TodoForm></TodoForm>
            <TodoList></TodoList>
        </>
    );

};

export default TodoContainer;