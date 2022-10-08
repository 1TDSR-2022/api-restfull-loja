import React from 'react'
import { Navigate, Route, Routes } from 'react-router-dom'
import Home from '../components/Home'
import Manipulador from '../components/Manipulador'
import Produtos from '../components/Produtos'

export default function MainRoutes() {
  return (
    <Routes>
        <Route path="/" element={<Home/>} />
        <Route path="/produtos" element={<Produtos/>}/>
        <Route path="/excluir/:id" element={<Manipulador/>} />
        {/* REDIRECT */}
        <Route path="*" element={<Navigate to="/produtos" replace/>} />
    </Routes>
  )

  }